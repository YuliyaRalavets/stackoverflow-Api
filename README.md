# stackoverflow-Api

Task description:
Написать приложение, которое отправляет на stackoverflow запрос на получение 10 последних ответов на сайте и проверяет, что в респонсе вернулись корректные данные.
GET https://api.stackexchange.com/2.2/answers?site=stackoverflow&page=1&pagesize=10&order=desc&sort=activity&filter=default

необходимо проверить:
1) статус код,
2) массив содержит не более 10 записей,
3) каждый элемент массива содержит объект Owner,
4) и для каждого объекта Owner нужно проверить, что link сформирован с помощью display_name и user_id полей.

# To run project please use: clean compile test -Dxml=api_tests