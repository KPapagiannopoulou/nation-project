import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortedCountriesComponent } from './sorted-countries.component';

describe('SortedCountriesComponent', () => {
  let component: SortedCountriesComponent;
  let fixture: ComponentFixture<SortedCountriesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SortedCountriesComponent]
    });
    fixture = TestBed.createComponent(SortedCountriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
