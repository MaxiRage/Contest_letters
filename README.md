# Contest_letters
Решение по задаче Яндекс.Контест "Самая сложная буква"

Василий решил улучшить свою скорость печати. Он заметил, что некоторые буквы на клавиатуре он ищет дольше, чем другие. Ему интересно, какую букву он искал дольше всего.

Напишите программу, которая поможет Василию узнать это.

Василий ввел N букв.
Строка S – строка, введенная Василием, имеет длину N.
Mассив A содержит N целых неотрицательных чисел, каждое число Ai – время в миллисекундах от начала ввода до того как была напечатана i-тая буква.

Считается, что Василий начал искать следующую букву сразу после того, как напечатал предыдущую. Букву с индексом 0 он искал A0 миллисекунд.

Формат ввода:
В первой строке входных данных находится N - количество введенных букв.
Во второй строке находится S – введенная строка, состоящая из N букв.
В третьей строке находится A – N целых неотрицательных чисел через пробел.

Ограничения:
0 < N < 10^6
0≤ A < 10^8

Массив A отсортирован в порядке возрастания:
Ai ≤ Aj если i<j

Формат вывода:
Выведите букву, которую Василий искал дольше всего. Если букв с одинаковым временем поиска несколько, выведите ту, что он напечатал последней.
