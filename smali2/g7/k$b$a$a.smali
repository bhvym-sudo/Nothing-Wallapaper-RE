.class final Lg7/k$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg7/k$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lg7/k;


# direct methods
.method constructor <init>(Lg7/k;)V
    .registers 2

    iput-object p1, p0, Lg7/k$b$a$a;->q:Lg7/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lg7/k$b$a$a;->q:Lg7/k;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lg7/k;->j1(Lg7/k;Ljava/lang/CharSequence;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lg7/k$b$a$a;->a(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
