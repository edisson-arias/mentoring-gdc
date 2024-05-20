namespace FizzBuzz.BusinessLayer
{
    public class Algorithm
    {
        private readonly List<INumberProcessor> _processors;

        public Algorithm(IEnumerable<INumberProcessor> processors)
        {
            _processors = processors.ToList();
        }
        public void Run(int targetNumber)
        {
            for (var i = 1; i <= targetNumber; i++)
            {
                var currentNumberResult = string.Empty;
                foreach (var processor in _processors)
                {
                    var processorResult = processor.Process(i);
                    if (!string.IsNullOrEmpty(processorResult))
                    {
                        currentNumberResult += processorResult;
                    }
                }
                Console.WriteLine(currentNumberResult == string.Empty
                    ? i
                    : currentNumberResult);
            }
        }
    }
}
