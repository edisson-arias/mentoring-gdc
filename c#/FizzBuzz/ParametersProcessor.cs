namespace FizzBuzz
{
    internal class ParametersProcessor
    {
        public static Parameters Get()
        {
        Console.WriteLine("Enter target number");
        var targetNumber = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter fizz number (3 in fizzbuzz)");
        var fizzNumber = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter fizz number (5 in fizzbuzz)");
        var buzzNumber = int.Parse(Console.ReadLine());


        Console.WriteLine("Enter fizz string ");
        var fizzString = Console.ReadLine();
        Console.WriteLine("Enter buzz string ");
        var buzzString = Console.ReadLine();

            return new Parameters
            {
                TargetNumber = targetNumber,
                FizzNumber = fizzNumber,
                BuzzNumber = buzzNumber,
                FizzString = fizzString,
                BuzzString = buzzString
            };
        }
    }
}
