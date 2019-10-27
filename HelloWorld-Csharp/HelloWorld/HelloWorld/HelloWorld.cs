using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorld
{
    public class HelloWorld
    {
        static void Main(String[] args)
        {
            SayHelloWorld(args);
            Console.ReadLine();
        }

        public static int SayHelloWorld(String[] args)
        {

            int i = 1;
            int Max = 3;

            int firstArg = 0;

            try
            {
                firstArg = (int)uint.Parse(args[0]);

                Console.WriteLine("VALID: argument <" + args[0] + "> used");
                Console.WriteLine("  ");
            }
            catch (OverflowException)
            {
                Console.WriteLine("Argument <" + args[0] + "> must be a Positive Integer");
                Console.WriteLine("  Using DEFAULT value: " + Max + " ");
                Console.WriteLine("  ");

                firstArg = Max;
            }
            catch (FormatException)
            {
                Console.WriteLine("Argument <" + args[0] + "> must be a Positive Integer");
                Console.WriteLine("  Setting DEFAULT value: " + Max + " ");
                Console.WriteLine("  ");

                firstArg = Max;
            }
            catch (IndexOutOfRangeException)
            {
                Console.WriteLine("MISSING ARGUMENT: Argument must be a Positive Integer");
                Console.WriteLine("  Using DEFAULT value: " + Max + " ");
                Console.WriteLine("  ");

                firstArg = Max;
            }
            catch (NullReferenceException)
            {
                Console.WriteLine("MISSING ARGUMENT: Argument must be a Positive Integer");
                Console.WriteLine("  Using DEFAULT value: " + Max + " ");
                Console.WriteLine("  ");

                firstArg = Max;
            }
            catch (Exception e)
            {
                Console.WriteLine("ERROR: argument <" + args[0] + "> caused an " + e + " error!");
                Console.WriteLine("  Using DEFAULT value: " + Max + " ");
                Console.WriteLine("  ");

                firstArg = Max;
            }
            Max = firstArg;

            while (i <= Max)
            {
                Console.WriteLine("Hello World ! " + i++ + " of " + Max);
            }
            Console.WriteLine(" ");

            return --i;
        }
    }
}
