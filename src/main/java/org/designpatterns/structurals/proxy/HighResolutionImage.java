package org.designpatterns.structurals.proxy;

/**
 * RealSubject
 */
public class HighResolutionImage implements Image {

    public HighResolutionImage(String imageFilePath) {

        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {

        // load Image from disk into memory
        // this is heavy and costly operation
    }

    @Override
    public void showImage() {

        // Actual Image rendering logic

    }

}
