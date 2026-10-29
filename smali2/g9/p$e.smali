.class final Lg9/p$e;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/p;->c(Lg9/d;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic r:Lg9/d;


# direct methods
.method constructor <init>(Lg9/d;)V
    .registers 2

    iput-object p1, p0, Lg9/p$e;->r:Lg9/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, Lg9/p$e;->r:Lg9/d;

    invoke-interface {p0}, Lg9/d;->cancel()V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lg9/p$e;->a(Ljava/lang/Throwable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
