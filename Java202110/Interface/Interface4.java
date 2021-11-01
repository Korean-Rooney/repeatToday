package Java202110.Interface;

public class Interface4 {
    
    public static void main(String[] args) {
        Skill sk = new Skill();
        sk.setHero(new warrior());
        sk.character_skill("전사");
    }
}

interface Hero {

    public void skill1(String character);

    public void skill2(String character);

    public void skill3(String character);

}

class warrior implements Hero{

    public void skill1(String character){
        System.out.println("후려치기");
    }

    public void skill2(String character){
        System.out.println("두번치기");
    }

    public void skill3(String character){
        System.out.println("세번치기");

    }

}

class magician implements Hero{

    public void skill1(String character){
        System.out.println("파이어볼");
    }

    public void skill2(String character){
        System.out.println("아이스볼");
    }

    public void skill3(String character){
        System.out.println("포이즌볼");

    }

}

class Skill {

    Hero hero;

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void character_skill(Hero hero) {
          hero.skill1(character);
          hero.skill2(character);
          hero.skill2(character);
    }
    

}