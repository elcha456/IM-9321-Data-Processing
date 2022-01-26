import java.time.LocalDate;

public class Record {
    LocalDate date;
    long cases;
    long deaths;
    String countryName;
    String countryCode;
    long population;
    String continent;
    double rate;

    Record(LocalDate date, long cases, long deaths, String countryName, String countryCode,
           long population, String continent, double rate) {
        this.date = date;
        this.cases = cases;
        this.deaths = deaths;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
        this.continent = continent;
        this.rate = rate;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public long getCases() {
        return cases;
    }

    public long getDeaths() {
        return deaths;
    }

    public long getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

}
