.class public final synthetic LP6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LP6/a;


# direct methods
.method public synthetic constructor <init>(LP6/a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/d;->q:LP6/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LP6/d;->q:LP6/a;

    invoke-static {p0}, LP6/a$c;->g(LP6/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
