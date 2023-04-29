package simpleGame;

public class Main {
    public static void main(String[] args)
    {
        Player1 player =new Player1("sam","sword",100);
        // System.out.println(player.getName());
        // System.out.println(player.getHealth());
        // System.out.println(player.getWeapon());
        // player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();
        // Player2 bettPlayer = new Player2("sam","machine gun",80, false);
        // bettPlayer.damageByGun1();
        player.heal();
    }
}
