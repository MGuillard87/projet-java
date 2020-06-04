package com;

import com.personnages.Guerrier;
import com.personnages.Magicien;
import com.personnages.Personnage;

import java.sql.*;


public class Connect {
    private static Connection connexion = null;

    public static Connection getConnexion() throws SQLException {
        if (connexion == null || connexion.isClosed()) {
            System.out.println("Driver O.K");

            String url = "jdbc:mysql://localhost:3306/hero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String passwd = "root";

            connexion = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connection effective !");
        }
        return connexion;
    }
    public static void getHeroes(int id, Personnage personnage) {
        try {
           Connection conn = getConnexion();
            //Création d'un objet Statement
            Statement state = conn.createStatement();
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT type, nom, niveauVie, niveauForce, armeSort FROM hero");
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();

            System.out.println("\n**********************************************************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************************************************");

            while(result.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t  " + result.getObject(i).toString() + "\t |");

                System.out.println("\n---------------------------------");

            }

            result.close();
            state.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getHero() {
        try {
            Connection conn = getConnexion();
            //Création d'un objet Statement
            Statement state = conn.createStatement();
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT type, nom, niveauVie, niveauForce, armeSort FROM hero WHERE id = 1");
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();

            System.out.println("\n**********************************************************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************************************************");

            while(result.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t  " + result.getObject(i).toString() + "\t |");

                System.out.println("\n---------------------------------");

            }

            result.close();
            state.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void close(PreparedStatement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (Exception e) {

        }

    }

    public void createHero(String nom, Personnage personnage) {
        PreparedStatement statement = null;
        try {
            Connection conn = getConnexion();
            String sql = "INSERT INTO hero (type, nom, niveauVie, niveauForce, armeSort, bouclier) VALUES (?, ?, ?, ?, ?, ?)";

            statement = conn.prepareStatement(sql);
            if (personnage instanceof Magicien) {
                statement.setString(1, "Magicien");
                statement.setString(2, nom);
                statement.setInt(3, personnage.getNiveauDeVie());
                statement.setInt(4, personnage.getForceAttaque());
                statement.setString(5, ((Magicien) personnage).getSort());
                statement.setString(6, ((Magicien) personnage).getPhiltres());
            } else {
                statement.setString(1,"Guerrier");
                statement.setString(2, personnage.getNom());
                statement.setInt(3, personnage.getNiveauDeVie());
                statement.setInt(4, personnage.getForceAttaque());
                statement.setString(5, ((Guerrier) personnage).getArme());
                statement.setString(6, ((Guerrier) personnage).getBouclier());
            }

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Le personnage a été inséré avec succès!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(statement);
        }
    }

    public void updateHero(String nom, Personnage personnage) {
        PreparedStatement statement = null;
        try {
            Connection conn = getConnexion();
            String sql = "UPDATE hero SET nom=? WHERE nom=?";

             statement = conn.prepareStatement(sql);
            //On met à jour les champs
            statement.setString(1, nom);
            statement.setString(2, personnage.getNom());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Personnage modifié avec succès!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
         this.close(statement);
        }
    }

    public static void deleteHero() {
        try {
            Connection conn = getConnexion();
            String sql = "DELETE FROM hero WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 9);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Personnage supprimé avec succès!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
