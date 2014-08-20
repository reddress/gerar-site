javac -encoding utf8 -cp .;../../../libs/jOpenDocument-1.3.jar br\com\pontualimportbrindes\staging\%1.java
@if %ERRORLEVEL% == 0 (
java -cp .;../../../libs/jOpenDocument-1.3.jar br.com.pontualimportbrindes.staging.%1
)

