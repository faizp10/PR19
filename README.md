# PR19 Web UI Test Framework
Proyek ini adalah kerangka pengujian UI web menggunakan Cucumber, Java, Gradle, dan Selenium. Proyek ini menggunakan pola Page Object Model untuk mewakili halaman web dan menulis kasus uji menggunakan sintaks Gherkin.

## Tujuan

- Menguji aplikasi web `https://www.saucedemo.com/` menggunakan Cucumber dan Selenium.
- Menggunakan Page Object Model untuk memisahkan logika pengujian dan logika halaman.
- Menulis kasus uji positif, negatif, dan batas.

loginpage
![Screenshot (31)](https://github.com/faizp10/PR19/assets/141897827/5c83ce91-5316-4dc4-b9a4-9527b35883bf)
homepage
![Screenshot (32)](https://github.com/faizp10/PR19/assets/141897827/cab03039-36cc-4efd-8597-8fd8cc5688a8)
loginsteps
![Screenshot (33)](https://github.com/faizp10/PR19/assets/141897827/6837bad7-6b61-43d0-ae9b-6aa43009c083)
![Screenshot (34)](https://github.com/faizp10/PR19/assets/141897827/780ad89e-2477-4f54-a3bd-5de1c0c57875)
![Screenshot (35)](https://github.com/faizp10/PR19/assets/141897827/e7de8d3b-4a68-4db5-9f4b-e96643f243b9)
Runcucumbertest
![Screenshot (36)](https://github.com/faizp10/PR19/assets/141897827/f173f249-6dae-490a-96c1-795796acc7c4)


## Penyiapan Proyek upload ke github

1. Clone repositori ini:
    ```sh
    git clone <repo-url>
    cd PR19
    ```

2. Jalankan pengujian:
    ```sh
    ./gradlew test
    ```

## Struktur Proyek

- `src/main/java/com/example/pages`: Kelas Page Object Model untuk halaman web.
- `src/test/java/com/example/steps`: Kelas definisi langkah untuk kasus uji Cucumber.
- `src/test/resources/com/example/features`: File fitur Cucumber.

## Dependensi

- Cucumber: Untuk mendefinisikan dan menjalankan kasus uji.
- Selenium: Untuk berinteraksi dengan browser web.
- JUnit: Untuk menjalankan pengujian.

## Kasus Uji

Kasus uji termasuk skenario login yang berhasil dan tidak berhasil.

### Login.feature

gherkin File
Feature: Login

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click the login button
    Then I should be logged in successfully

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter invalid username and password
    And I click the login button
    Then I should see an error message

screenshot hasil akhir
![Screenshot (37)](https://github.com/faizp10/PR19/assets/141897827/dec472b9-6f01-4ad7-bc8b-ec8aa4df37c9)

