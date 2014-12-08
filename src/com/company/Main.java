package com.company;

import java.util.ArrayList;

/**
 * Created by Kudlaty on 2014-12-09.
 */
public class Main {

    private ArrayList<Track> tracks;
    private Player player;
    private TrackList reader;
//    private Random randomtrack;

    public Main()
    {
        tracks = new ArrayList<Track>();
        player = new Player();
        reader = new TrackList();
//      randomtrack = new Random();
        readLibrary("audio");
        System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
        System.out.println();
    }

    private boolean indexValid(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;

        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= tracks.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }

    private void readLibrary(String folderName)
    {
        ArrayList<Track> tempTracks = reader.readTracks(folderName, ".mp3");

        // Put all thetracks into the organizer.
        for(Track track : tempTracks) {
            addTrack(track);
        }
    }

    public int getNumberOfTracks()
    {
        return tracks.size();
    }

    public void removeTrack(int index)
    {
        if(indexValid(index)) {
            tracks.remove(index);
        }
    }
    public void stopPlaying()
    {
        player.stop();
    }

    public void addFile(String filename)
    {
        tracks.add(new Track(filename));
    }

    public void addTrack(Track track)
    {
        tracks.add(track);
    }

    public void playTrack(int index)
    {
        if(indexValid(index)) {
            Track track = tracks.get(index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
        }
    }
}
