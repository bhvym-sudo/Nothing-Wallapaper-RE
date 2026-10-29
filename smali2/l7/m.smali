.class public final synthetic Ll7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Ll7/k;


# direct methods
.method public synthetic constructor <init>(Ll7/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/m;->q:Ll7/k;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Ll7/m;->q:Ll7/k;

    check-cast p1, Lm7/a;

    invoke-static {p0, p1}, Ll7/k$d$a$d;->s(Ll7/k;Lm7/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
