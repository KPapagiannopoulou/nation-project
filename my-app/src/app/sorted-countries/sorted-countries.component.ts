import { Component, OnInit } from '@angular/core';
import { RESTAPIServiceService } from '../restapiservice.service';

interface Country {
  name: string;
  area: number;
  country_code2: string;
}

@Component({
  selector: 'app-sorted-countries',
  templateUrl: './sorted-countries.component.html',
  styleUrls: ['./sorted-countries.component.css']
})
export class SortedCountriesComponent implements OnInit {
  countries: Country[] = [];

  constructor(private restapiservice: RESTAPIServiceService) { }

  ngOnInit() {

    this.restapiservice.sendGetRequest().subscribe((data: any) => {
      console.log(data);
      this.countries = data as Country[];
    })
  }

}
