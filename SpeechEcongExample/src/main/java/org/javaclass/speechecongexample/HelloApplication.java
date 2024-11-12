package org.javaclass.speechecongexample;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.components.KeepOnScreenComponent;
import com.almasb.fxgl.dsl.components.ProjectileComponent;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.intelligence.speechrecog.SpeechRecognitionService;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.HashMap;
import java.util.Map;
import edu.cmu.sphinx.api.Configuration;

import static com.almasb.fxgl.dsl.FXGL.*;


public class HelloApplication extends GameApplication {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.setAcousticModelPath(
                "resource:/edu/cmu/sphinx/models/en-us/en-us"
        );
        config.setDictionaryPath("");
        config.setLanguageModelPath("");

        launch(args);

    }

    private final Map<String, Color> color = Map.of(
      "yellow",Color.YELLOW,
      "green", Color.GREEN,
      "blue",Color.BLUE,
      "red",Color.RED,

            "bread",Color.RED
    );

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.addEngineService(SpeechRecognitionService.class);

    }


private final Map<String, Entity> entityMap = new HashMap<>();
    private Entity currentEntity;
    private final Map<String,Point2D> directions = Map.of(
            "up", new Point2D(0,-1),
            "down", new Point2D(0,1),
            "left", new Point2D(-1,0),
            "right", new Point2D(1,0)
    );
    @Override
    protected void initGame() {
        getService(SpeechRecognitionService.class).addInputHandler((input,confidence) ->{
            System.out.println(input);

            handleInput(input);
        });

        getService(SpeechRecognitionService.class).start();

        color.forEach((name, color)-> {
           var e =spawnEntity(color);
           entityMap.put(name,e);

               currentEntity = e;

        });

    }

    private void handleInput(String input) {
        var tokens = input.trim().toLowerCase().split(" +");
        for (String token:tokens){
            if(color.containsKey(token)){
                currentEntity = entityMap.get(token);
            }

            if(directions.containsKey(token)){
                var dir =directions.get(token);
                currentEntity.getComponent(ProjectileComponent.class).setDirection(dir);

            }
        }
    }

    private Entity spawnEntity(Color color){
        ProjectileComponent projectileComponent = new ProjectileComponent(new Point2D(1,0),25);
        projectileComponent.allowRotation(true);
        return entityBuilder()
                .at(640,340)
                .view(new Rectangle(40,40, color))
                .with(projectileComponent)
                .with(new KeepOnScreenComponent())
                .buildAndAttach();
    }
}