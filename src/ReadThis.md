**Данная работа является практикой, проектом.**

Цель: Написать queue (очередь).

_______________________________

**Queue** - **структура данных**, которая похожа на самую обычную очередь, например, в магазине *(если говорить про принцип FIFO)*, или на колоду карт, ты будешь брать карту за картой, чтобы дойти до конца *(это уже принцип LIFO)*.

*Как работает queue (очередь)?*

 Она работает по двум принципам:
  - **FIFO** *(first in, first out)*, первый элемент попадает в очередь и первым из нее выходит.
  - **LIFO** *(last in, first out)*, последний элемент попадает в очередь и первым из нее выйходит. 
  
_______________________________
- Данная очередь работает по принципу *FIFO*.

_______________________________
**Инструкция**:
_______________________________
*Методы*:
 - **addToQueue** - **добавляет элемент в конец очереди**, возвращает *true*, если добавление прошло успешно, в противном случае - *false*.
 - **removeFromQueue** - **удаляет элемент из начала очереди**, *сначала удаляет его, затем возвращает для дальнеших манипуляций с ним*, если все прошло успешно, а если нет, то *возвращает 0*.
 - **firstElement** - **возвращает элемент, который находится в начале очереди**, если все прошло успешно, а если нет, то *возвращает 0*.
 - **printQueue** - **выводит всю очередь в консоль**, а если она пуста, то выводит *"Queue is empty"*.
 - **isEmpty** - **возвращает true**, если очередь пуста, *false - если очередь не пуста*.
 - **isFull** - **возвращает true**, если очередь полная, *false - если не полная*.
 
_______________________________
**Стоит иметь ввиду что данная очередь работает с типом данных int (целыми числами)**, очередь написана при помощи массива, поэтому **надо указать ей размер**, *по умолчанию размер равен 10 элементов*, **если вам нужно сменить размер очереди, достаточно перейти в test.java и на 5 строке кода (MyQueue queue=new MyQueue(10);) в круглых скобках указать нужный вам размер**.
_______________________________
**Спасибо за прочтение, теперь вы все знаете об этой программе.** 😉
 