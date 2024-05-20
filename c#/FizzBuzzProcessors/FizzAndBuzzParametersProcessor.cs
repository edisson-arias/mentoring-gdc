namespace FizzBuzz.Parameters
{
    public class FizzAndBuzzParametersProcessor : IFizzAndBuzzParametersProcessor
    {
        public FizzAndBuzzParametersProcessor(IUserInputProvider userInputProvider)
        {
            _userInputProvider = userInputProvider;
        }
        private FizzAndBuzzParameters _parameters = new();
        bool _isPopulated = false;
        private readonly IUserInputProvider _userInputProvider;

        public FizzAndBuzzParameters Parameters
        { 
            get 
            {
                if (_isPopulated)
                {
                    return _parameters;
                }
                var currentInput = _userInputProvider.GetAnswer("Enter fizz number, or leave it blank to use default value (3 in fizzbuzz)");
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.FizzNumber = int.Parse(currentInput);
                }
                currentInput =_userInputProvider.GetAnswer("Enter buzz number, or leave it blank to use default value (5 in fizzbuzz)");
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.BuzzNumber = int.Parse(currentInput);
                }
                currentInput = _userInputProvider.GetAnswer("Enter fizz string, or leave it blank to use default value");
                if (!string.IsNullOrEmpty(currentInput))
                {
                    _parameters.FizzString = currentInput;
                }
                currentInput = _userInputProvider.GetAnswer("Enter buzz string, or leave it blank to use default value ");
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
