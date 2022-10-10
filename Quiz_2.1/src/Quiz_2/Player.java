package Quiz_2;

import java.util.Objects;

public record Player(int id, String name, int level){

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}











//public class Player {

    //private int ID;
    //private String Name;
    //private int Level;

   // public Player(int ID, String name, int level) {
      //  this.ID = ID;
      //  Name = name;
       // Level = level;
   // }

   // public int getID() {
       // return ID;
   // }

   // public void setID(int ID) {
      //  this.ID = ID;
    //}

   // public String getName() {
       // return Name;
    //}

   // public void setName(String name) {
     //   Name = name;
   // }

   // public int getLevel() {
      //  return Level;
    //}

   // public void setLevel(int level) {
   //     Level = level;
  // }


   // @Override
   // public String toString() {
      //  return "Player{" +
             //   "ID=" + ID +
             //   ", Name='" + Name + '\'' +
             //   ", Level=" + Level +
              //  '}';
   // }

    //@Override
    //public boolean equals(Object o) {
     //   if (this == o) return true;
      //  if (o == null || getClass() != o.getClass()) return false;
      //  Player player = (Player) o;
       // return ID == player.ID && Level == player.Level && Objects.equals(Name, player.Name);
    //}

    //@Override
   // public int hashCode() {
        //return Objects.hash(ID, Name, Level);
   // }
//}
