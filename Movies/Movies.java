class Movies {
  public static void main(String[] args) {
    String[] movieTitles = {
        "Indiana Jones et les Aventuriers de l'Arche Perdue",
        "Indiana Jones et le Temple Maudit",
        "Indiana Jones et la Dernière Croisade"
    };

    String[][] movieActors = {
        { "Harrison Ford", "Karen Allen", "Paul Freeman" },
        { "Harrison Ford", "Kate Capshaw", "Ke Huy Quan" },
        { "Harrison Ford", "Sean Connery", "Denholm Elliott" }
    };

    for (int i = 0; i < movieTitles.length; i++) {
      System.out.println("Dans le film " + movieTitles[i] + ", les principaux acteurs sont : " + movieActors[i][0]
          + ", " + movieActors[i][1] + ", " + movieActors[i][2]);
    }
  }
}