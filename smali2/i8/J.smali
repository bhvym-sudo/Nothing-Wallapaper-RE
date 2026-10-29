.class public final Li8/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lw8/a;


# instance fields
.field private final q:Lv8/a;


# direct methods
.method public constructor <init>(Lv8/a;)V
    .registers 3

    const-string v0, "iteratorFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/J;->q:Lv8/a;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, Li8/K;

    iget-object p0, p0, Li8/J;->q:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Iterator;

    invoke-direct {v0, p0}, Li8/K;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
