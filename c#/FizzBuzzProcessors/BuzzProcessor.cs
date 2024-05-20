using FizzBuzz.BusinessLayer;
using FizzBuzz.Parameters;

namespace FizzBuzz.NumberProcessor
{
    public class BuzzProcessor : INumberProcessor
    {
        private readonly FizzAndBuzzParametersProcessor _parametersProcessor;

        public BuzzProcessor(FizzAndBuzzParametersProcessor parametersProcessor) =>
            _parametersProcessor = parametersProcessor;
        public string? Process(int i) =>
             i % _parametersProcessor.Parameters.BuzzNumber == 0
                ? _parametersProcessor.Parameters.BuzzString
                : null;
    }
}
