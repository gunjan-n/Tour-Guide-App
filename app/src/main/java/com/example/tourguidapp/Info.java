package com.example.tourguidapp;

public class Info {

    private int mHeadingId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Info object.
     *
     * @param HeadingId is the string resource ID
     */
    public Info(int HeadingId) {
        mHeadingId = HeadingId;
    }

        /**
         * Create a new Info object.
         *
         * @param HeadingId is the string resource ID
         * @param imageResourceId is the drawable resource ID for the image associated with the info
         */
    public Info(int HeadingId, int imageResourceId) {
            mHeadingId = HeadingId;
            mImageResourceId = imageResourceId;
        }

    /**
     * Get the string resource ID
     */
    public int getHeadingId() {
        return mHeadingId;
    }

    /**
     * Return the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this info.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
