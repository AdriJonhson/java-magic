public class Card {

    private String name;
    private Integer attack;
    private Integer block;

    public Card(String name, Integer attack, Integer block) {
        this.name = name;
        this.attack = attack;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", block=" + block +
                '}';
    }
}
