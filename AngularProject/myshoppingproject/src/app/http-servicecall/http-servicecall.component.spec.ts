import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpServicecallComponent } from './http-servicecall.component';

describe('HttpServicecallComponent', () => {
  let component: HttpServicecallComponent;
  let fixture: ComponentFixture<HttpServicecallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpServicecallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpServicecallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
