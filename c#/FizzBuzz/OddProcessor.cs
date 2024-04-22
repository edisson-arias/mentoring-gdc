namespace FizzBuzz
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
