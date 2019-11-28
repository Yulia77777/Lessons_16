package tests.search;

public class SearchSteps {
    private SearchPage serc = new SearchPage();

    public void searchBlouse() {
        serc.clearAndSendKeys(serc.search, "Blouse");
        serc.click(serc.searchBtn);
    }
}
