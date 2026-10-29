.class public final Ld6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld6/a$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/nothing/systemui/shared/clocks/view/D;

.field private final b:Ld6/a$a;

.field private final c:Ld6/a$a;


# direct methods
.method public constructor <init>(Lcom/nothing/systemui/shared/clocks/view/D;FF)V
    .registers 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/a;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    new-instance p1, Ld6/a$a;

    invoke-direct {p1, p0, p2}, Ld6/a$a;-><init>(Ld6/a;F)V

    iput-object p1, p0, Ld6/a;->b:Ld6/a$a;

    new-instance p1, Ld6/a$a;

    invoke-direct {p1, p0, p3}, Ld6/a$a;-><init>(Ld6/a;F)V

    iput-object p1, p0, Ld6/a;->c:Ld6/a$a;

    return-void
.end method


# virtual methods
.method public a(F)V
    .registers 2

    return-void
.end method
