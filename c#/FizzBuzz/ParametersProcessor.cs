namespace FizzBuzz
{
    internal class ParametersProcessor : IParametersProcessor
    {
        public int TargetNumber
        {
            get
            {
                Console.WriteLine("Enter target number");
                return int.Parse(Console.ReadLine());
            }
        }
    }

    internal class FizzAndBuzzParametersProcessor : IFizzAndBuzzParametersProcessor
    {
        private readonly ParametersProcessor _parametersProcessor;

        public FizzAndBuzzParameters GetFizzAndBuzzParameters()
        {
            Console.WriteLine("Enter fizz number (3 in fizzbuzz)");
            var fizzNumber = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter fizz number (5 in fizzbuzz)");
            var buzzNumber = int.Parse(Console.ReadLine());


            Console.WriteLine("Enter fizz string ");
            var fizzString = Console.ReadLine();
            Console.WriteLine("Enter buzz string ");
            var buzzString = Console.ReadLine();

            return new FizzAndBuzzParameters
            {
                FizzNumber = fizzNumber,
                BuzzNumber = buzzNumber,
                FizzString = fizzString,
                BuzzString = buzzString
            };

        }
    }

    internal interface IParametersProcessor
    {
        int TargetNumber { get; }
    }

    internal interface IFizzAndBuzzParametersProcessor
    {
        FizzAndBuzzParameters GetFizzAndBuzzParameters();
    }
}
