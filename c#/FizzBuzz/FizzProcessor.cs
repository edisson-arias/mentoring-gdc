namespace FizzBuzz
{
    internal class FizzProcessor : INumberProcessor
    {
        private readonly FizzAndBuzzParameters _parameters;

        public FizzProcessor(FizzAndBuzzParameters parameters)
        {
            _parameters = parameters;
        }
        public string Process(int i)
        {
            if (i % _parameters.FizzNumber == 0)
            {
                return _parameters.FizzString;
            }
            return null;
        }
    }
}
