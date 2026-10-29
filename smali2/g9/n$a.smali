.class final Lg9/n$a;
.super Lg9/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final d:Lg9/e;


# direct methods
.method constructor <init>(Lg9/w;LP8/e$a;Lg9/h;Lg9/e;)V
    .registers 5

    invoke-direct {p0, p1, p2, p3}, Lg9/n;-><init>(Lg9/w;LP8/e$a;Lg9/h;)V

    iput-object p4, p0, Lg9/n$a;->d:Lg9/e;

    return-void
.end method


# virtual methods
.method protected c(Lg9/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lg9/n$a;->d:Lg9/e;

    invoke-interface {p0, p1}, Lg9/e;->b(Lg9/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
