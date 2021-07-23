package com.company;

public class Main {

    public static void main(String[] args) {
        Bosss bosss = new Bosss();
        bosss.setHealth(600);
        bosss.setDamage(70);
        bosss.setSewing("MagikSewing");
        System.out.println("health:" + bosss.getHealth() + "    damage:" + bosss.getDamage() + "   sewing:" + bosss.getSewing());

    }
}
