namespace FizzBuzz.Parameters
{
    internal class FizzAndBuzzParametersProcessor : IFizzAndBuzzParametersProcessor
    {
        private FizzAndBuzzParameters _parameters = new();
        bool _isPopulated = false;

        public FizzAndBuzzParameters Parameters
        { 
            get 
            {
                if (_isPopulated)
                {
                    return _parameters;
                }
                
                Console.WriteLine("Enter fizz number, or leave it blank to use default value (3 in fizzbuzz)");
                var currentInput = Console.ReadLine();
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.FizzNumber = int.Parse(currentInput);
                }
                Console.WriteLine("Enter buzz number, or leave it blank to use default value (5 in fizzbuzz)");
                currentInput = Console.ReadLine();
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.BuzzNumber = int.Parse(currentInput);
                }
                Console.WriteLine("Enter fizz string, or leave it blank to use default value ");
                currentInput = Console.ReadLine();
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.FizzString = currentInput;
                }
                Console.WriteLine("Enter buzz string, or leave it blank to use default value ");
                currentInput = Console.ReadLine();
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.BuzzString = currentInput;
                }
                _isPopulated = true;
                return _parameters;
            }
        }
    }
}
