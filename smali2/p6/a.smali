.class public final Lp6/a;
.super Lc2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/a$a;
    }
.end annotation


# static fields
.field public static final d:Lp6/a$a;


# instance fields
.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lp6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lp6/a;->d:Lp6/a$a;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0, p1}, Lc2/a;-><init>(I)V

    iput p1, p0, Lp6/a;->c:I

    return-void
.end method


# virtual methods
.method public a(F)I
    .registers 2

    iget p0, p0, Lp6/a;->c:I

    div-int/lit8 p0, p0, 0x2

    return p0
.end method

.method public final c(I)I
    .registers 2

    if-ltz p1, :cond_8

    add-int/lit8 p1, p1, -0x1

    iget p0, p0, Lp6/a;->c:I

    mul-int/2addr p1, p0

    return p1

    :cond_8
    const/4 p0, 0x0

    return p0
.end method
