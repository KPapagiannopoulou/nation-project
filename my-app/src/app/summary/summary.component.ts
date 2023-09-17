import { Component, OnInit } from '@angular/core';
import { RESTAPIServiceService } from '../restapiservice.service';

interface Sum {
  continent: string;
  region: string;
  country: string;
  year: number;
  population: number;
  gdp: number;
}

@Component({
  selector: 'app-summary',
  templateUrl: './summary.component.html',
  styleUrls: ['./summary.component.css']
})
export class SummaryComponent implements OnInit {
  summary: Sum[] = [];

  constructor(private restapiservice: RESTAPIServiceService) { }

  ngOnInit() {

    this.restapiservice.getSummaryGrid().subscribe((data: any) => {
      console.log(data);
      this.summary = data as Sum[];
    })
  }
}
