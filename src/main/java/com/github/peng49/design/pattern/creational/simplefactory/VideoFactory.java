package com.github.peng49.design.pattern.creational.simplefactory;

public class VideoFactory {
    public static Video getVideo(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(JavaVideo.class.getName().equals(clazz.getName())){
            return new JavaVideo(1.0);
        }

        return (Video) Class.forName(clazz.getName()).newInstance();
    }
}
