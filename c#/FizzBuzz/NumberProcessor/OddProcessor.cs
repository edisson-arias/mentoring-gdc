using FizzBuzz.BusinessLayer;

namespace FizzBuzz.NumberProcessor
{
    internal class OddProcessor : INumberProcessor
    {
        public string? Process(int number)
        {
            return number % 2 == 0
                ? "odd"
                : null;
        }
    }
}
