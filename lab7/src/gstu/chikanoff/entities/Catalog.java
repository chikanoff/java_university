package gstu.chikanoff.entities;

import java.util.Date;
import java.util.List;

public class Catalog {
    private String name;
    List<Note> notes;

    public Catalog(String name, List<Note> notes) {
        this.name = name;
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append("\n");
        for (Note note : notes) {
            sb.append(note).append("\n");
        }
        return sb.toString();
    }

    public static class Note{
        private Date date;
        private String title;

        public Note(Date date, String title) {
            this.date = date;
            this.title = title;
        }

        @Override
        public String toString() {
            return date + ";" + title;
        }
    }
}
