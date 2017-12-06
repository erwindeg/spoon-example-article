package nl.edegier.spoon;

import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;

/**
 * Created by Erwin on 10/12/2016.
 */
public class Analyzer {
    public static void main(String[] args) {
        final SpoonAPI spoon = new Launcher();
        spoon.addInputResource("src/main/java");
        spoon.setSourceOutputDirectory("src/main/generated");

        spoon.addProcessor(new AbstractProcessor<CtClass<?>>() {
            @Override
            public void process(CtClass ctClass) {
                System.out.println(ctClass.getQualifiedName());
            }
        });

        spoon.run();
    }

}
