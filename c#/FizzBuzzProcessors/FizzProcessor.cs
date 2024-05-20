using FizzBuzz.BusinessLayer;
using FizzBuzz.Parameters;

namespace FizzBuzz.NumberProcessor
{
    public class FizzProcessor : INumberProcessor
    {
        private readonly FizzAndBuzzParametersProcessor _parametersProcessor;

        public FizzProcessor(FizzAndBuzzParametersProcessor parametersProcessor)
        {
            _parametersProcessor = parametersProcessor;
        }
        public string? Process(int i)
        {
            if (i % _parametersProcessor.Parameters.FizzNumber == 0)
            {
                return _parametersProcessor.Parameters.FizzString;
            }
            return null;
        }
    }
}
