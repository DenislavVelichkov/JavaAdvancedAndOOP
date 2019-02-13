package JavaAdvanced.Generics_17.Exercise.CustomList_8_ver2;

public class CommandParser {
    private SmartList<String> smartList;

    public CommandParser() {
        this.smartList = new SmartList<>();
    }

    public void execute(String command) {
        String[] tokens = command.split("\\s+");

        switch (tokens[0]) {
            case "Add":
                this.smartList.add(tokens[1]);
                break;
            case "Remove":
                this.smartList.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(this.smartList.contains(tokens[1]));
                break;
            case "Swap":
                this.smartList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                break;
            case "Greater":
                System.out.println(this.smartList.countGreaterThan(tokens[1]));
                break;
            case "Max":
                System.out.println(this.smartList.getMax());
                break;
            case "Min":
                System.out.println(this.smartList.getMin());
                break;
            case "Print":
                System.out.println(smartList);
                break;
        }
    }
}
