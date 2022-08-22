public class Cell {
    int x;
    int y;
    enum Symbol {x, o, e};
    Symbol symbol;
    public Cell(int a, int b){
        x = a;
        y = b;
        symbol = Symbol.e;

    }
    public Cell(int a, int b, Symbol symb){
        x = a;
        y = b;
        symbol = symb;

    }
    public Cell(Cell c){
        x = c.x;
        y = c.y;
        symbol = c.symbol;

    }

    public String getSymbol(){
        if(this.symbol.equals(Symbol.e))
            return "empty";
        else if(this.symbol.equals(Symbol.x))
            return "x";
        else if(this.symbol.equals(Symbol.o))
            return "o";
        else
            return  null;
    }
}
