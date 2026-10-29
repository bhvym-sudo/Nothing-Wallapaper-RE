.class public final Ld6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private a:F

.field private b:Z

.field final synthetic c:Ld6/a;


# direct methods
.method public constructor <init>(Ld6/a;F)V
    .registers 3

    iput-object p1, p0, Ld6/a$a;->c:Ld6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ld6/a$a;->a:F

    const/high16 p1, 0x3f000000    # 0.5f

    cmpl-float p1, p2, p1

    if-lez p1, :cond_f

    const/4 p1, 0x1

    goto :goto_10

    :cond_f
    const/4 p1, 0x0

    :goto_10
    iput-boolean p1, p0, Ld6/a$a;->b:Z

    return-void
.end method
