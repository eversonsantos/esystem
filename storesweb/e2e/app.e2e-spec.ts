import { StoreswebPage } from './app.po';

describe('storesweb App', () => {
  let page: StoreswebPage;

  beforeEach(() => {
    page = new StoreswebPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
