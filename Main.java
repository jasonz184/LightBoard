public class Main
{
    public static void main(String[] args)
    {
        LightBoard l = new LightBoard(1000, 1000);
        System.out.println(l.test());
        LightBoard sim = new LightBoard(7, 5);
        boolean[][] lights = 
        {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, false, true, true},
            {false, false, false, false, false},
        };
        sim.setLights(lights);
        System.out.println(sim.evaluateLight(0, 3));
        System.out.println(sim.evaluateLight(6, 0));
        System.out.println(sim.evaluateLight(4, 1));
        System.out.println(sim.evaluateLight(5, 4));
    }
}