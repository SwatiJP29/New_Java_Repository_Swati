import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmplistservcomComponent } from './emplistservcom.component';

describe('EmplistservcomComponent', () => {
  let component: EmplistservcomComponent;
  let fixture: ComponentFixture<EmplistservcomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmplistservcomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmplistservcomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
