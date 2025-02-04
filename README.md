Модульность в Java 9 — это одна из ключевых особенностей, введенных в этой версии языка, которая позволяет организовывать код в модули. Эта концепция значительно улучшает управление зависимостями, инкапсуляцию и структуру больших приложений. Давайте рассмотрим основные аспекты модульности в Java 9.

Основные концепции модульности
Модули: Модуль — это группа связанных пакетов и ресурсов, которые могут быть собраны и управляемы как единое целое. Каждый модуль имеет свой собственный module-info.java, в котором описываются его зависимости и экспортируемые пакеты.

Файл module-info.java: Это специальный файл, который находится в корне модуля и описывает его имя, зависимости и пакеты, которые он экспортирует. Пример:


module com.example.myapp { 
    requires java.sql; // Зависимость от модуля java.sql
    exports com.example.myapp.service; // Экспортируемый пакет
}

Инкапсуляция: Модульная система позволяет контролировать, какие части вашего кода доступны другим модулям. Вы можете экспортировать только те пакеты, которые хотите сделать доступными, а остальные могут быть скрыты.

Управление зависимостями: Модули позволяют явно указывать зависимости между различными частями приложения. Это упрощает управление версиями и совместимостью библиотек.

Упрощение сборки: Модульная система облегчает сборку и развертывание приложений, так как вы можете работать с модулями, а не с отдельными классами или пакетами.

Преимущества модульности
Улучшенная читаемость и поддерживаемость: Код становится более структурированным, что облегчает его понимание и сопровождение.
Снижение конфликтов зависимостей: Явное указание зависимостей помогает избежать проблем с несовместимыми библиотеками.
