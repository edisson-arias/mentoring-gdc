namespace FizzBuzz.Parameters
{
    internal class FizzAndBuzzParametersProcessor : IFizzAndBuzzParametersProcessor
    {
        public FizzAndBuzzParameters GetFizzAndBuzzParameters()
        {
            var result = new FizzAndBuzzParameters();
            Console.WriteLine("Enter fizz number, or leave it blank to use default value (3 in fizzbuzz)");
            var currentInput = Console.ReadLine();
            if (!string.IsNullOrEmpty(currentInput)) 
            { 
                result.FizzNumber = int.Parse(currentInput);
            }
            Console.WriteLine("Enter buzz number, or leave it blank to use default value (5 in fizzbuzz)");
            currentInput = Console.ReadLine();
            if (!string.IsNullOrEmpty(currentInput))
            {
                result.BuzzNumber = int.Parse(currentInput);
            }
            Console.WriteLine("Enter fizz string, or leave it blank to use default value ");
            currentInput = Console.ReadLine();
            if (!string.IsNullOrEmpty(currentInput))
            { 
                result.FizzString = currentInput;
            }
            Console.WriteLine("Enter buzz string, or leave it blank to use default value ");
            currentInput = Console.ReadLine();
            if (!string.IsNullOrEmpty(currentInput))
            { 
                result.BuzzString = currentInput; 
            }
            return result;
        }
    }
}
