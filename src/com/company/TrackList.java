package com.company;

import java.util.ArrayList;

public class TrackList extends Track {

    private String TrackListName;
    private String TrackListDesc;
    private ArrayList <Track> Tracks;

//    public void TrackList(String TrackListName, String TrackListDesc){
//        String name = TrackListName;
//        String desc = TrackListDesc;
//    }

    public void setTracks (ArrayList<Track> tracks){
        tracks = Tracks;
    }

    public void setTrackListName(String name){
        name = TrackListName;
    }

    public void setTrackListDesc(String desc){
        desc = TrackListDesc;
    }

    public void TrackList(String desc, String name){

    }
    public void addTrack(Track track){
        Tracks.add(track);
    }

    public void removeTrack(Track track){
        Tracks.remove(track);
    }

    public void editTrackListName (String newName){

    }
    public void editTrackListDesc (String newDesc){

    }
    public void saveTrackList (TrackList newTrackList){

    }
    public void getTrackPath (Track filePath){

    }
    public void getRandomTrackPath (Track filePath){

    }
}

