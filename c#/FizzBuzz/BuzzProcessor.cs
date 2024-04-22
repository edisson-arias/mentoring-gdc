namespace FizzBuzz
{
    internal class BuzzProcessor : INumberProcessor
    {
        private readonly FizzAndBuzzParameters _parameters;

        public BuzzProcessor(FizzAndBuzzParameters parameters) =>
            _parameters = parameters;
        public string? Process(int i) =>
             (i % _parameters.BuzzNumber == 0)
                ? _parameters.BuzzString
                : null;
        }
}
